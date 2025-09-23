$(document).ready(function () {
    $('.modify-btn').click(function () {

        const $button = $(this);
        const $row = $button.closest('tr');
        const codeSeq = $row.attr('id').split('-')[1]; // 'row-1234'에서 '1234' 추출

        // 버튼 텍스트에 따라 다른 로직 실행
        if ($button.text() === '수정') {
            convertToEditMode($row, $button);
        } else if ($button.text() === '저장') {
            saveChanges($row, $button, codeSeq);
        }
    });

});
// 수정 모드로 변환하는 함수
function convertToEditMode($row, $button) {
    const $cells = $row.children('td');

    $cells.slice(1, 7).each(function() {
        const originalText = $(this).text();
        $(this).data('original', originalText); // 원래 값을 데이터에 저장
        $(this).html(`<input style="width: 80px" type="text" value="${originalText}" class="edit-input">`);
    });

    // 버튼 텍스트를 "저장"으로 변경
    $button.text('저장');
}

// 변경 사항을 저장하는 함수 (데이터 전송)
function saveChanges($row, $button, codeSeq) {
    const $cells = $row.children('td');
    const updatedData = {
        codeSeq: codeSeq,
        codeId: $cells.eq(1).find('input').val(),
        codeDc: $cells.eq(2).find('input').val(),
        codeValue: $cells.eq(3).find('input').val(),
        codeNm: $cells.eq(4).find('input').val(),
        sortOrd: $cells.eq(5).find('input').val(),
        useYn: $cells.eq(6).find('input').val()
    };

    console.log('업데이트할 데이터:', updatedData);

    // 서버에 POST 요청 보내기
    sendPost('/code/update', updatedData);

    // 저장 후 다시 텍스트 모드로 변환
    revertToTextMode($row, $button);
}

// 텍스트 모드로 되돌리는 함수
function revertToTextMode($row, $button) {
    const $cells = $row.children('td');

    // 입력 필드를 다시 원래 텍스트로 변경
    $cells.slice(1, 7).each(function() {
        const originalText = $(this).find('input').val(); // 변경된 값으로 복구
        $(this).text(originalText);
    });

    // 버튼 텍스트를 "수정"으로 변경
    $button.text('수정');
}

function codeDelete(codeId) {
    const data = {'codeId': codeId}
    sendPost('/code/delete', data, function (response) {
        if (response.success) {
            location.reload();
        }
    });
}
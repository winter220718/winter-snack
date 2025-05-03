function sendGet(url, data) {
    $.ajax({
        url: url,  // 실제 GET 요청 보낼 URL
        method: 'GET',
        data : data,
        success: function(response) {
            console.log('성공:', response);
        },
        error: function(xhr, status, error) {
            console.error('실패:', error);
        }
    });
}
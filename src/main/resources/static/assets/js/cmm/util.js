function sendGet(url, data) {
    $.ajax({
        url: url,
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


function sendPost(url, data, successCallback, errorCallback) {
    $.ajax({
        url: url,
        method: 'POST',
        data : data,
        success: function(response) {
            if (successCallback) {
                successCallback(response);
            }
        },
        error: function(xhr, status, error) {
            if (errorCallback) {
                errorCallback(xhr, status, error);
            }
        }
    });
}
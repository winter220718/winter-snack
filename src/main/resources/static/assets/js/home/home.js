function getItems(_this) {

    const data = {
        codeValue: $(_this).data('ctnm')
    }
    sendGet("/item", data);
}



function getItem(data) {
    let code = {"codeDc" : data.dataset.value}
    console.log(code);

    sendGet("/item", code);
}



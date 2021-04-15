function deleteRow(id) {
    $("#" + id).fadeOut(500)
}

function addRow() {
    $.ajax({
        url: "http://localhost:8080/api/row",
        type: "GET",
        success: function (data) {
            $("#tbody").append($('<tr id="'+ data["id"] + '">\n' +
                '        <td>' + data["name"] + '</td>\n' +
                '        <td>' + data["count"] + '</td>\n' +
                '        <td><button onclick="deleteRow('+ data["id"] + ')">delete</button></td>\n' +
                '      </tr>'))
        }
    })
}
function actorSelected(select) {
    let index = select.selectedIndex;
    let option = select.options[index];
    let id = option.value;
    let nombre = option.text;
    let urlImagen = option.dataset.url;

    option.disabled = true;
    select.selectedIndex = 0;

    let ids = $("#ids").val();

    if (ids === "") {
        $("#ids").val(id);
    } else {
        $("#ids").val(ids + "," + id);
    }

    agregarActor(id, nombre, urlImagen);
}

function agregarActor(id, nombre, urlImagen) {
    let htmlString = `
      <div class="card col-md-3 m-2" style="width: 10rem">
        <img src="${urlImagen}" class="card-img-top">
        <div class="card-body">
          <p class="card-text">${nombre}</p>
          <button class="btn btn-danger" data-id="${id}" onclick="eliminarActor(this)">Eliminar</button>
        </div>
      </div>`;
  
    $("#protagonistas_container").append(htmlString);
}

function eliminarActor(btn) {
    let id = btn.dataset.id;
    let node = btn.parentElement.parentElement;

    let arrayIds = $("#ids").val().split(",").filter(idActor => idActor != id);

    $("#ids").val(arrayIds.join(","));

    $("#protagonistas option[value='" + id + "']").prop("disabled", false);

    $(node).remove();
}

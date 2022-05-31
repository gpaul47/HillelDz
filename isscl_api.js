const isscl_api_result_btn = document.getElementById("isscl_api_result_btn");
const isscl_api_longitude = document.getElementById("isscl_api_longitude");
const isscl_api_latitude = document.getElementById("isscl_api_latitude");

isscl_api_result_btn.addEventListener("click", getAPI);
let endPointIsscl = "http://api.open-notify.org/iss-now.json";

function getAPI() {
  fetch(endPointIsscl, {
    method: "GET",
  })
    .then((res) => res.json())
    .then((data) => {
      isscl_api_longitude.innerHTML =
        "Longitude is: " + data.iss_position.longitude;
      isscl_api_latitude.innerHTML =
        "Latitude is: " + data.iss_position.latitude;
    });
}

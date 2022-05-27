const get_api_res_btn = document.getElementById("get_api_res_btn");
const api_result = document.getElementById("api_result");
const random_dog_result = document.getElementById("random_dog_result");

get_api_res_btn.addEventListener("click", getAPI);

let endPoint = "http://worldclockapi.com/api/json/est/now";

//  https://random.dog/woof.json
function getAPI() {
  fetch(endPoint, {
    method: "GET",
  })
    .then((res) => res.json())
    .then((data) => {
      api_result.innerHTML = data.dayOfTheWeek;
    });
}

get_api_random_dog.addEventListener("click", getAPIDog);

let endPoint1 = "https://random.dog/woof.json";

//  https://random.dog/woof.json
function getAPIDog() {
  fetch(endPoint1, {
    method: "GET",
  })
    .then((res) => res.json())
    .then((data) => {
      random_dog_result.innerHTML =
        "<img src=" + data.url + " width='240' height='180' >";
    });
}

// {"fileSizeBytes":1653565,"url":"https://random.dog/0ade71f5-3b4e-4a2c-a40d-fc1d07586088.jpg"}

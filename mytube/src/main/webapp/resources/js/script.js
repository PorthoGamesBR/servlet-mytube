console.log("Hello World")

var listaDeVideos = []
const videoServerLink = "http://127.0.0.1:8080/mytube/video_list"

async function getVideos() {
    try {
        const response = await fetch(videoServerLink);
        if (!response.ok) {
          throw new Error(`Response status: ${response.status}`);
        }
        const json = await response.json();
        listaDeVideos = json["lista"];
        console.log(json);
      } catch (error) {
        console.error(error.message);
      }


      let videoList = document.getElementById("list-area");
      listaDeVideos.forEach((element) => videoList.appendChild(
        document.createElement('<div class="flex-row"><a href="javascript:openVideo('+ "'" + element["video_link"] + "'" + ')><img class="miniature" src="' + element["miniature_link"] + '"><h2>' + element["titulo"] + '</h2></a></div>')
      ));
}

function openVideo(videoLink) {
    let videoPlayer = document.getElementById("video-player");
    let videoSource = document.getElementById("video-source");
    videoSource.setAttribute('src', videoLink);
    videoPlayer.load();
}
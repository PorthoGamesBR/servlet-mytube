console.log("Hello World")

var listaDeVideos = []
const videoServerLink = "video_list"

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
      
      listaDeVideos.forEach((element) => {
        let divListElement = document.createElement('div');
        let aVideoLink = document.createElement('a')
        aVideoLink.setAttribute("href","javascript:openVideo('" + element["video_link"] + "','" +  element["titulo"] + "')");
        aVideoLink.setAttribute("class","flex-row");
        let imgMiniature = document.createElement("img");
        imgMiniature.setAttribute("class","miniature");
        imgMiniature.setAttribute("src",element["miniature_link"]);
        let h2Title = document.createElement("h2")
        h2Title.innerHTML = element["titulo"]
        aVideoLink.appendChild(imgMiniature);
        aVideoLink.appendChild(h2Title);
        divListElement.appendChild(aVideoLink);
        videoList.appendChild(divListElement);
    });
}

function openVideo(videoLink, title) {
    let videoPlayer = document.getElementById("video-player");
    let videoSource = document.getElementById("video-source");
    let videoTitle = document.getElementById("video-title");
    videoTitle.innerHTML = title;
    videoSource.setAttribute('src', videoLink);
    videoPlayer.load();
}
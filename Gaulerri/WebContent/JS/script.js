function addZero(i) {
    if (i < 10) {
        i = "0" + i;
    }
    return i;
}

function clockFunction() {
    var d = new Date();
    var x = document.getElementById("btn-clock");
    var h = addZero(d.getHours());
    var m = addZero(d.getMinutes());
    var s = addZero(d.getSeconds());
    x.innerHTML = h + ":" + m + ":" + s;
	setTimeout('clockFunction()', 1000);
}

var myCenter=new google.maps.LatLng(57.7087,11.9751);

function initialize()
{
var mapProp = {
  center:myCenter,
  zoom:5,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };

var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker=new google.maps.Marker({
  position:myCenter,
  });

marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);


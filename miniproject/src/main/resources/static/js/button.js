/**
 * 
 */
 $(document).ready(function(){


 $('#buttonBox > #btn').on('click', function() {
	var randomNum = Math.floor(Math.random() *3+1); 
	var imgStr= "image/fruit0" + randomNum + ".jpg";
	$('#random img').attr('src', imgStr);

});
});

function newdi()  {
  window.location.href="child/detail/Product_Detail5.html";
};

function btn(){
	
      alert("회원만 이용 가능합니다");
    };
    
function newba()  {
  window.location.href ="child/SpBasket/SpBasket2.html";
};

$(".mdata").click(function(){
	changeMainData(this);
	$(".mdata").css({"background-color": "white"});
	$(this).css({"background-color": "#a8edae"});
});

function changeMainData(data){
	var arr = data.innerHTML;
	var x = arr.split("---");
	var name = (x[0].split(":"))[1];
	var sal = (x[1].split(":"))[1];

	$("#empName").html(name);
	$("#empSal").html(sal);
}

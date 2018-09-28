var data=[{
	"name": "足球"
},{
	"name": "篮球"
},{
	"name": "排球"
},{
	"name": "网球"
},{
	"name": "板球"
}];
$.each(data,function(index,sport){
	$("ul").append("<li>"+sport["name"]+"</li>");
});
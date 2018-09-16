        function init() {
            var s1 = document.getElementsByName("s1").item(0);
            var options = new Array(10);
            for (var i = 0; i < 10; i++) {
                options[i] = "选项" + (i + 1);
            }
            s1.length = 10;
            for (var i = 0; i < 10; i++) {
                s1.options[i].value = i + 1;
                s1.options[i].text = options[i];
            }
        }

        function move(a, b) {
            a = document.getElementsByName(a).item(0);
            b = document.getElementsByName(b).item(0);

            var index = a.selectedIndex;
            if (index == -1) {
                alert("没有选择");
                return;
            }
            b.length++;
            b.options[b.length - 1].value = a.options[index].value;
            b.options[b.length - 1].text = a.options[index].text;
            a.remove(index);
        }

        function moveAll(a, b) {
            a = document.getElementsByName(a).item(0);
            b = document.getElementsByName(b).item(0);


            if (a.length == 0) {
                alert("没有选择");
                return;
            }
            b.length = a.length + b.length;
            for (var i = 0; i < a.length; i++) {
                b.options[b.length - a.length + i].value = a.options[i].value;
                b.options[b.length - a.length + i].text = a.options[i].text;
            }
            a.length = 0;
        }
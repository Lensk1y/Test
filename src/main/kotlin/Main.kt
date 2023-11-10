fun main(args: Array<String>) {
    print("Input a: ");
    val a:String = readln();
    var i:Int;
    var j:Int = 0;
    var stop:Boolean = false;
    var s:Char = 's';
    var cnt:Int = 0;
    var b:String = "";
    for (i in a.indices)
    {
        if (i == j)
        {
            while (!stop) {
                if(j == a.length) break;
                stop = false;
                s = a[i];
                if (s == a[j]) {
                    cnt++; j++;
                } else stop = true;
            }
            b += s;
            if (cnt != 1) b += cnt.toString();
            s = 's';
            cnt = 0;
            stop = false;
        }
    }
    print("Sorted array: " + b);


}
package domain;

public class RequestBaseDo {

    public RequestBaseDo()
    {}

    //父类把基本操作做完后，之类只要重写处理方法，即可拓展新增的不同请求处理
    public String deal()
    {
        return "base Class";
    }
}

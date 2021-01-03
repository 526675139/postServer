package domain;

public class ResponseDoFactory {
    public static <T extends RequestBaseDo> T createRequestDo(String className)
    {
        RequestBaseDo curDo = null;
        try
        {
            curDo = (T)Class.forName(className).newInstance();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return (T)curDo;
    }
}

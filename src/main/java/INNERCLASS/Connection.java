package INNERCLASS;

/**
 * Created by taiseerhabib on 5/20/16.
 */
public interface Connection {

    public String getIp();

    public String getPort();

    public String getProtocol();

    public String connect();

    public String close();


}

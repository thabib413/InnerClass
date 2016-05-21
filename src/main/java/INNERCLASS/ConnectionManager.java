package INNERCLASS;

/**
 * Created by taiseerhabib on 5/20/16.
 */
public class ConnectionManager {

    int connectionLimit = 0;

    public Connection makeAConnection(String ip, String Port){
        if(connectionLimit <= 2) {
            connectionLimit += 1;
            return this.new ManagedConnection(ip, Port);
        } else return null;
    }

    private class ManagedConnection implements Connection {


        String ip, port, protocol;
        Boolean closed;


        public ManagedConnection(String IP, String Port){
            this.ip = IP;
            this.port = Port;
            this.protocol = "https";
            this.closed = false;
        }


        public String getIp() {
            if(!closed){
                return this.ip;
            } return "IP in use";
        }

        public String getPort() {
            if(!closed) {
                return this.port;
            } return "Port closed";
        }

        public String getProtocol() {
            if(!closed){
              return this.protocol;
            } return "already closed";
        }

        public String connect() {
            if(!closed){
                return "Connect";
            }  return "Sorry, closed";
        }

        public String close() {
            if(!closed) {
                connectionLimit -= 1;
                closed = true;
                return "Connection Closed";
            } return "Already closed";
        }
    }
}

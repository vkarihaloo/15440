import java.io.*;
import java.lang.*;
import java.net.*;

public class RMIRegistryMessage implements Serializable {
    private char msgType;
    private String objectName;
    private RemoteObjectRef ror;

    private static final char FINDREG = 'r';
    private static final char ISREG   = 'i';
    private static final char LOOKUP  = 'l';
    private static final char FOUND   = 'f';

    public RMIRegistryMessage (char _msgType) {
        msgType = _msgType;
    }

    public RMIRegistryMessage (char _msgType, 
                              String _objectName) 
    {
        msgType    = _msgType;
        objectName = _objectName;
    }

    public RMIRegistryMessage (char _msgType, 
                                RemoteObjectRef _ror)
    {
        msgType = _msgType;
        ror     = _ror;
    }

    public char getMessageType() {
        return msgType;
    }

    public RemoteObjectRef getRemoteObjectRef() {
        return ror;
    }

    public String getRMIObjectName() {
        return objectName;
    }

}




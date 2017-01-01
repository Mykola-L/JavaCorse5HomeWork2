package Module8;

import java.util.UUID;


interface IdProvider {
    long getNewId();
}

interface HasIdentification {
    long getId();
}

final class UuidProvider implements IdProvider {
    private static UuidProvider instance;
    private UuidProvider(){}

    public long getNewId()
    {
        return -(UUID.randomUUID().getLeastSignificantBits());
    }

    static public UuidProvider getInstance(){
        if (instance==null) instance=new UuidProvider();
        return  instance;
    }
}

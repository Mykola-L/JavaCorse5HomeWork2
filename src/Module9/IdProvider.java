package Module9;

import java.util.UUID;


interface IdProvider {
    long getNewId();
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
    Contact GitHub API Training Shop Blog About
        © 2017 GitHub, Inc. Terms Privacy Security Status

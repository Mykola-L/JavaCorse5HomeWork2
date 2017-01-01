package Module5.api;

import java.util.UUID;


class IdProvider {
    static public long getNewId() {
        return (UUID.randomUUID().getLeastSignificantBits());
    }
}

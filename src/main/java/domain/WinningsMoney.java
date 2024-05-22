package domain;

import java.util.List;

public class WinningsMoney {

    private static final int THREE_MATCHES = 5000;
    private static final int FOUR_MATCHES = 50000;
    private static final int FIVE_MATCHES = 150000;
    private static final int SIX_MATCHES = 20000000;

    public List<Integer> matchesMoney() {
        return List.of(THREE_MATCHES, FOUR_MATCHES, FIVE_MATCHES, SIX_MATCHES);
    }
}
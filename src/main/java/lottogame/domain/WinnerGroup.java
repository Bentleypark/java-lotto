package lottogame.domain;

public class WinnerGroup {
    final private LottoRankData rankData;
    private int count;
    private int revenue;

    WinnerGroup(LottoRankData rankData, int count) {
        this.rankData = rankData;
        this.count = count;
    }

    public LottoRankData getRankData() { return rankData; }

    private int getCount() {
        return count;
    }

    int getRevenue() {
        return revenue;
    }

    void addCount() {
        count += 1;
        revenue = rankData.getPrize() * count;
    }

    @Override
    public String toString() {
        return getRankData().getMatch() + "개 일치" + "(" + getRankData().getPrize() + ")- " + getCount() + "개 ";
    }
}

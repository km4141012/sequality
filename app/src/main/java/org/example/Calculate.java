package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  // 個人の基本料金を計算するメソッド
  public int getIndividualFee(int age) {
    if (age <= 12) {
      return 1000;
    } else {
      return 2000;
    }
  }

  // グループ全体の料金を計算するメソッド
  public int getTotalFee(int age, int groupSize) {
    int individualFee = getIndividualFee(age);
    int totalFee = individualFee * groupSize;

    // 10人以上なら10%割引
    if (groupSize >= 10) {
      totalFee = (int) (totalFee * 0.9);
    }

    return totalFee;
  }
}

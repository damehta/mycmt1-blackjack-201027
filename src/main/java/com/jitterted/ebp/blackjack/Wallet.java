package com.jitterted.ebp.blackjack;

public class Wallet {

  private int balance;

  public Wallet() {
    balance = 0;
  }

  public boolean isEmpty() {
    return balance == 0;
  }

  public void addMoney(int amount) {
    requireAmountZeroOrMore(amount);
    balance += amount;
  }

  private void requireAmountZeroOrMore(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  public int balance() {
    return balance;
  }
}

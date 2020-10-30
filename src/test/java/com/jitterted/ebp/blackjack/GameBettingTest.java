package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GameBettingTest {

  @Test
  public void newGamePlayerBalanceIs0() throws Exception {
    Game game = new Game();

    assertThat(game.playerBalance())
        .isZero();
  }

  @Test
  public void playerDeposits100BalanceIs100() throws Exception {
    Game game = new Game();

    game.playerDeposits(100);

    assertThat(game.playerBalance())
        .isEqualTo(100);
  }

  @Test
  public void playerWith100BalanceBets100BalanceIs0() throws Exception {
    Game game = new Game();
    game.playerDeposits(100);

    game.playerBets(100);

    assertThat(game.playerBalance())
        .isZero();
  }

  @Test
  public void playerWith100BalanceBets100AndWinsBalanceIs200() throws Exception {
    Game game = new Game();
    game.playerDeposits(100);
    game.playerBets(100);

    game.playerWins();

    assertThat(game.playerBalance())
        .isEqualTo(200);
  }

}
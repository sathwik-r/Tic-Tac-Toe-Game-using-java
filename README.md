# Tic-Tac-Toe-Game-using-java
Run TicTacToe.java on a java compiler

1) For 9 boxes I created 9 integer variables(tried doing it with array but array was showing invalied)

2) 9 integers are a,b,c,d,e,f,g,h,i which are 0 before game starts

3) I didnot see that there should be X and O so if player one chooses a box then it will be filled with 1 and if player two chooses a box it will be filled with 2

4) There are 2 java methods named playerone and playertwo which return 1 when their respective players win

5) There is one method named NewGame which starts new game by showing instructions and it initiates 9 integers to 0

6) A for loop is called which runs for 9 times max(controlled by count which is 0 initially)

7) players choose their box alternatively and after player one chooses a box, playerone method will be called if player one wins loop is exited and count is decreased by 1 to make sure it will not be 9 after loop(count=9 means draw) and program asks user for new game

8) if no player won means all 9 boxes are filled i.e, count=9

9) if count==9 after loop game is drawn

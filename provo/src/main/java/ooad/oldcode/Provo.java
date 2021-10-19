package ooad.oldcode;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Provo {

//    public static void main(String[] args){
//        Questions questions = new Questions();
//        ArrayList<Quiz> quiz = new ArrayList<>();
//        Quiz quiz1 = new Quiz(questions.createQuestions());
//        quiz.add(quiz1);
//        Score score = new Score();
//        Stopwatch stopwatch = new Stopwatch();
//        Answer answer = new Answer();
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<User> usersArrayList = new ArrayList<>();
//        String screen = "menu";
//        boolean provoRunning = true;
//        User loggedInUser = null;
//        User teacher = new User("teacher", "123", true);
//        usersArrayList.add(teacher);
//
//        do {
//            switch (screen) {
//
//                case "menu": {
//
//                    do {
//                        System.out.println("=========================================");
//                        System.out.println("=               Main menu               =");
//                        System.out.println("=========================================");
//                        if (loggedInUser == null) {
//                            System.out.println("Wat wil je doen?");
//                            System.out.println("Kies tussen: registeren, inloggen of verlaten");
//                            String menuChoice = scanner.nextLine();
//                            if ("register".equals(menuChoice)) {
//                                screen = "register";
//                            } else if ("login".equals(menuChoice)) {
//                                screen = "login";
//                            } else if ("quit".equals(menuChoice)) {
//                                screen = "quit";
//                            }
//                        } else {
//                            System.out.println("Logged in as " + loggedInUser.getUsername());
//                            System.out.println("What would you like to do?");
//                            System.out.println("Choose between: play quiz, logout or quit");
//                            String menuChoice = scanner.nextLine();
//                            if ("logout".equals(menuChoice)) {
//                                screen = "logout";
//                            } else if ("play quiz".equals(menuChoice)) {
//                                screen = "play quiz";
//                            } else if ("quit".equals(menuChoice)) {
//                                screen = "quit";
//                            }
//                        }
//                    } while (screen == "menu");
//                }
//
//                break;
//
//                case "register": {
//                    User user = new User("", "", false);
//                    boolean verifiedUsername = false;
//                    boolean verifiedPassword = false;
//                    String username;
//
//                    System.out.println("=========================================");
//                    System.out.println("=               Register                =");
//                    System.out.println("=========================================");
//
//                    do {
//                        System.out.println("Type a username:");
//                        username = scanner.nextLine();
//                        verifiedUsername = user.verifyUsername(usersArrayList, username);
//                    } while (!verifiedUsername);
//
//                    user.setUsername(username);
//
//                    do {
//                        System.out.println("Type password:");
//                        String pass1 = scanner.nextLine();
//                        System.out.println("Confirm password:");
//                        String pass2 = scanner.nextLine();
//                        if (pass1.equals(pass2)) {
//                            user.setPassword(pass1);
//                            verifiedPassword = true;
//                        }
//                    } while (!verifiedPassword);
//
//                    usersArrayList.add(user);
//                    screen = "login";
//                }
//
//                break;
//
//                case "login": {
//                    User user = new User("", "", false);
//                    Boolean loginCheck = false;
//
//                    System.out.println("=========================================");
//                    System.out.println("=               Login                   =");
//                    System.out.println("=========================================");
//
//                    do {
//                        System.out.println("Username:");
//                        String username = scanner.nextLine();
//                        System.out.println("Password:");
//                        String password = scanner.nextLine();
//
//                        loginCheck = user.loginCheck(usersArrayList, username, password);
//                        if (loginCheck) {
//                            loggedInUser = user.loginUser(usersArrayList, username, password);
//                            screen = "menu";
//                        }
//                    } while (screen == "login");
//                }
//
//                break;
//
//                case "quit": {
//                    provoRunning = false;
//                }
//
//                break;
//
//                case "logout": {
//                    loggedInUser = null;
//                    screen = "menu";
//                }
//
//                break;
//
//                case "play quiz": {
//                    int i = 0;
//                    Random rand = new Random();
//                    int randomQuiz = rand.nextInt(quiz.size());
//                    stopwatch.start();
//                    quiz.get(randomQuiz).setAllQuestionsAnswered(false);
//
//                    System.out.println("=========================================");
//                    System.out.println("=               Quiz                    =");
//                    System.out.println("=========================================");
//
//                    do {
//                        System.out.println(quiz.get(randomQuiz).questions.get(i).question);
//                        if (quiz.get(randomQuiz).questions.get(i).isMultipleChoice() == true) {
//                            System.out.println(answer.getMutlipleChoiceAnswers(randomQuiz, i));
//                        }
//                        String guessAsString = scanner.nextLine();
//                        System.out.println(quiz.get(randomQuiz).questions.get(i).CompareAnswer(guessAsString, score));
//                        i++;
//                        if (i >= quiz.get(randomQuiz).questions.size()) {
//                            quiz.get(randomQuiz).setAllQuestionsAnswered(true);
//                        }
//                    }
//                    while (!quiz.get(randomQuiz).isAllQuestionsAnswered());
//                    if (1 == 0) {
//                        screen = "menu";
//                    } else {
//                        screen = "score";
//                    }
//                }
//
//                break;
//
//                case "score": {
//                    boolean quizEnd = false;
//                    System.out.println("=========================================");
//                    System.out.println("=               Score                   =");
//                    System.out.println("=========================================");
//
//                    do {
//                        System.out.println("Congrats, you got " + score.getAantalGoed() + " questions correct.");
//                        quizEnd = true;
//                    }
//                    while (!quizEnd);
//                    stopwatch.stop();
//                    score.setAantalSeconde(stopwatch.getElapsedTimeSecs());
//                    System.out.println("Congrats, your score is " + score.getScore());
//                    score.resetAantalGoed();
//                    screen = "menu";
//                }
//
//                break;
//            }
//        }
//        while (provoRunning == true);
//    }
}


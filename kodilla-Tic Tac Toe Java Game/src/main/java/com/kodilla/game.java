package com.kodilla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class game extends Application {
    private Image imageback = new Image("file:resources/nowa_plansza.png");
    private Image cross = new Image("file:resources/krzyzyk2.png");
    private Image circle = new Image("file:resources/kolko.png");
    private FlowPane crosss = new FlowPane(Orientation.HORIZONTAL);
    private List<Button> buttons = new ArrayList<>();
    private boolean isX = true;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

//        ImageView img = new ImageView(cross);
//        crosss.getChildren().add(img);
//
//        grid.add(crosss, 0, 0, 3, 1);


        for (int i = 0; i < 9; i++){
            Button button = new Button();
            button.setOnAction(event -> {
                if(isX){
                    button.setGraphic(new ImageView(cross));
                    isX = false;
                } else {
                    button.setGraphic(new ImageView(circle));
                    isX=true;
                }
                System.out.println("Kliknięto");

                checkWinner();{

                }

            });
            button.setBackground(null);
            button.setPrefHeight(200);
            button.setPrefWidth(200);
            int column = i % 3;
            //reszta całkowita z dzielenia
            int row = (int) i/3;
            grid.add(button, column, row);
            buttons.add(button);
        }
//        if((buttons.get(0) == buttons.get(1) == buttons.get(2))){
//            System.out.println("Winner!!");
//        }
//        if (buttons.equals(buttons(0)) && buttons.equals(buttons(1))) {
//            System.out.println("Winner!!");
//        } else {
//            System.out.println("Coś tam!!");
//        }
//        if (buttons[0].getState() + buttons[1].getState() + buttons[2].getState() == 3) {
//            System.out.println("Winner");
//        }

        Scene scene = new Scene(grid, 680, 680, Color.BLACK);

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public void checkWinner(){
        int crossCount = 0;
        int circleCount = 0;

        for(int n=0; n<9; n++){
            Button button = buttons.get(n);
            //rzutuje typ imageViev na image
            if (button.getGraphic() == null){
                continue;
            }
            Image buttonImage = ((ImageView) button.getGraphic()).getImage();
            if (cross.equals(buttonImage)){
                crossCount ++;
            }
            if (circle.equals(buttonImage)){
                circleCount ++;
            }
            if(n % 3 == 0 && n != 0){
                if (crossCount == 3){
                    System.out.println("Wygrał krzyżyk");
                }
                if(circleCount == 3){
                    System.out.println("Wygrało kółko");
                }
                crossCount = 0;
                circleCount = 0;
            }
        }
    }
}

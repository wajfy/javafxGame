package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class InsideController {
    @FXML
    Label nameLabel;
    @FXML
    Label ageLabel;
    @FXML
    Label goldLabel;
    @FXML
    Label healthLabel;
    @FXML
    Label damageLabel;
    @FXML
    Label armorLabel;
    @FXML
    Label intLabel;
    @FXML
    Label speedLabel;
    @FXML
    Label charLabel;
    @FXML
    Label heightLabel;
    @FXML
    Label energyLabel;

    @FXML
    Label dayLabel;


    @FXML
    ImageView profilePicture;

    String[] pictures = {
            "1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png", "10.png",
            "11.png", "12.png", "13.png", "14.png", "15.png", "16.png", "17.png", "18.png", "19.png", "20.png",
            "21.png", "22.png", "23.png", "24.png", "25.png", "26.png", "27.png", "28.png", "29.png", "30.png",
            "31.png", "32.png"
    };

    Hero hrdina;
    int dayNumber = 0;
    public static int getRandomNumber(int min, int max){
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }
    public Image getRandomPicture(){
        int index = getRandomNumber(0, 31);
        String picture = "img/CharacterPic/" + this.pictures[index];
        return new Image(Objects.requireNonNull(getClass().getResourceAsStream(picture)));
    }
    public void createNewHero(String username, int age){
        Image pic = getRandomPicture();
        this.hrdina = new Hero(username, age, pic);
    }
    public void displayInfo(){
        nameLabel.setText(hrdina.getHeroName());
        profilePicture.setImage(hrdina.getHeroImage());

        goldLabel.setText(Integer.toString(hrdina.getHeroGold()));
        healthLabel.setText(hrdina.getHeroHealth() + "/" + hrdina.getHeroMaxHealth());
        energyLabel.setText(hrdina.getHeroEnergy() + "/" + hrdina.getHeroMaxEnergy());

        ageLabel.setText(Integer.toString(hrdina.getHeroAge()));
        heightLabel.setText(Integer.toString(hrdina.getHeroHeight()));

        damageLabel.setText(Integer.toString(hrdina.getHeroDamage()));
        armorLabel.setText(Integer.toString(hrdina.getHeroArmor()));
        speedLabel.setText(Integer.toString(hrdina.getHeroSpeed()));
        intLabel.setText(Integer.toString(hrdina.getHeroIntelligence()));
        charLabel.setText(Integer.toString(hrdina.getHeroCharisma()));
    }
    public void nextDay(){
        dayNumber++;
        dayLabel.setText("Day: " + dayNumber);
    }
}

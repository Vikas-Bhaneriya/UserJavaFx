package sample;


import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
public class Controller implements Initializable {

    @FXML
    private Button menu,btn_today,btn_notify;
    @FXML
    private ImageView img_user,img_sw,imgHw,img_newsw,imgLog,img_msg;

    @FXML
    private AnchorPane navList;
    @FXML
    private TableView tableview;


    public void ShowSoft() {

        TranslateTransition closeNav=new TranslateTransition(new Duration(350), navList);
        img_sw.setOnMouseClicked(evt ->{

                closeNav.setToX(-(navList.getWidth()));
                closeNav.play();

        });
    }



    public void ShowNewSoft(){


        TranslateTransition closeNav=new TranslateTransition(new Duration(350), navList);
        img_newsw.setOnMouseClicked(evt ->{

                closeNav.setToX(-(navList.getWidth()));
                closeNav.play();

        });

    }

    public void ShowHW()
    {

        TranslateTransition closeNav=new TranslateTransition(new Duration(350), navList);
        imgHw.setOnMouseClicked(evt ->{

            closeNav.setToX(-(navList.getWidth()));
            closeNav.play();

        });

    }
    public void ShowMsg()
    {
        TranslateTransition closeNav=new TranslateTransition(new Duration(350), navList);
        img_msg.setOnMouseClicked(evt ->{

                closeNav.setToX(-(navList.getWidth()));
                closeNav.play();

        });


    }
    public void ShowLog(){
        TranslateTransition closeNav=new TranslateTransition(new Duration(350), navList);
        imgLog.setOnMouseClicked(evt ->{

                closeNav.setToX(-(navList.getWidth()));
                closeNav.play();

        });


    }
    public void ShowNotification(){


        for ( int i = 0; i<tableview.getColumns().size(); i++) {
            tableview.getColumns().clear();
        }


        TranslateTransition closeNav=new TranslateTransition(new Duration(350), navList);
        btn_notify.setOnAction((ActionEvent evt)->{

                closeNav.setToX(-(navList.getWidth()));
                closeNav.play();

        });

        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");

        tableview.getColumns().addAll(firstNameCol, lastNameCol, emailCol);




    }

    public void ShowToday()

    {
        for ( int i = 0; i<tableview.getColumns().size(); i++) {
            tableview.getColumns().clear();
        }



        TranslateTransition closeNav=new TranslateTransition(new Duration(350), navList);
        btn_today.setOnAction((ActionEvent evt)->{

            closeNav.setToX(-(navList.getWidth()));
            closeNav.play();

        });




        TableColumn first = new TableColumn("Third  Name");
        TableColumn last = new TableColumn("Four Collumn Name");
        TableColumn email = new TableColumn("Fifth Collumn");
        tableview.getColumns().addAll(first, last, email);







    }

    public void ShowSettings(){

        TranslateTransition openNav=new TranslateTransition(new Duration(350), navList);
        openNav.setToX(0);
        TranslateTransition closeNav=new TranslateTransition(new Duration(350), navList);
        menu.setOnAction((ActionEvent evt)->{
            if(navList.getTranslateX()!=0){
                openNav.play();
            }else{
                closeNav.setToX(-(navList.getWidth()));
                closeNav.play();
            }
        });



    }





    public void initialize(URL url, ResourceBundle rb) {
//        navList.setItems(FXCollections.observableArrayList("Red","Yellow","Blue"));
        prepareSlideMenuAnimation();
    }

    private void prepareSlideMenuAnimation() {
        TranslateTransition openNav=new TranslateTransition(new Duration(350), navList);
        openNav.setToX(0);
        TranslateTransition closeNav=new TranslateTransition(new Duration(350), navList);
        menu.setOnAction((ActionEvent evt)->{
            if(navList.getTranslateX()!=0){
                openNav.play();
            }else{
                closeNav.setToX(-(navList.getWidth()));
                closeNav.play();
            }
        });
    }

}

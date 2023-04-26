module com.example.cs2450_final_project {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.cs2450_final_project to javafx.fxml;
    exports com.example.cs2450_final_project;
}
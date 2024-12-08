package MVC;

import javafx.scene.input.MouseEvent;

public class ClickDistanceController {
	private ClickDistanceModel model;
	private ClickDistanceView view;
	
	public ClickDistanceController(ClickDistanceModel model,
			ClickDistanceView view) {
		this.model = model;
		this.view = view;
		view.getStage().getScene().setOnMouseClicked(this::processMouseClick);
	}
	public void processMouseClick(MouseEvent event) {
		// from view
	       double clickX = event.getX();
	        double clickY = event.getY();
	        // passing info to view to adjust the line
	        view.line.setEndX(clickX);
	        view.line.setEndY(clickY);
	        // from model
	        model.setXY(clickX, clickY);
	        double distance = model.getDistance();
	        String distanceStr = String.format("%.2f", distance);
	        // talk to view to set distance label
	        view.distanceText.setText("Distance:  " + distanceStr);
	
	}
}
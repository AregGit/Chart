import scala.swing._

object MainWindow extends MainFrame {
	title = "See your statistics"
	menuBar = new MenuBar {
       		contents += new Menu("File") {
			contents += new MenuItem(new Action("New"){def apply{}})
			contents += new MenuItem(new Action("Open"){def apply{}})
			contents += new MenuItem(new Action("Save"){def apply{}})
			contents += new MenuItem(new Action("Save As..."){def apply{}})
			contents += new MenuItem(new Action("Exit"){def apply{}})
		}
       		contents += new Menu("Edit") {
			contents += new MenuItem(new Action("Find"){def apply{}})
			contents += new MenuItem(new Action("Find Maximum"){def apply{}})
			contents += new MenuItem(new Action("Find Minimum"){def apply{}})
			contents += new MenuItem(new Action("Print"){def apply{}})
		}
       		contents += new Menu("Help"){def apply{}}
	}
	var f = new MainFrame { contents = new Label("Hi") }
	f.visible = true
	contents = new GridPanel(0, 1) {
	//	contents += f//new Frame{}// {
		//	preferredSize = new Dimension(700, 200)
		//}
		/*contents += new Frame() {
			preferredSize = new Dimension(700, 700)
		}*/
		
		//contents += new MainFrame() {
			//preferredSize = new Dimension(700, 700)
		//}

		contents += new Label("Redy")
		contents += new Label("Redy")
		contents += new Label("Redy")
		contents += new Label("Redy")
	}
	//contents += new Label("Redy")
	//preferredSize = new Dimension(700, 400)
}

object MainChart {
	def main(arg: Array[String]): Unit = {
		println("Lets start")
		MainWindow.visible = true
		
	}
}

import java.nio.file._

def createDirs(root: String) :Unit = {
	 List("main","test").foreach(target =>{
	 		List("scala","java","resources").foreach(dirname => {
	 			println("creating " + Paths.get(root,target,dirname))
	 			Files.createDirectories(Paths.get(root,target,dirname))
	 		})
	})
}


args.length match { 
	case 1 => createDirs(args(0))
	case _ => println("tell the directory name")
}
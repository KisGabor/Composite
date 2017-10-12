package hu.codesolution.composite;

import hu.codesolution.composite.controller.CompositeController;
import hu.codesolution.composite.model.File;
import hu.codesolution.composite.model.Folder;
import hu.codesolution.composite.model.Resource;

public class Client {

	public static void main(String[] args) {
		Folder root = new Folder("root");
		
		Folder dev = new Folder("dev");
		root.addResources(dev);
		
		Folder nul = new Folder("nul");
		root.addResources(nul);
		
		Folder home = new Folder("home");
		root.addResources(home);
		
		Folder user = new Folder("valaki");
		home.addResources(user);
		
		File readme = new File("readme.txt", 11);
        File linux = new File("debian.iso", 2048);
        user.addResources(readme);
        user.addResources(linux);
        File welcome = new File("motd", 200);
        root.addResources(welcome);

        System.out.println("total size: " + root.getSize());
        printTreeStructure(root, "/", "");
        
        CompositeController controller = new CompositeController();
        controller.startDesktop();
        
        
	}
	
        
        public static void printTreeStructure(Resource resource, String directoryPath, String indent) {
            if (resource instanceof Folder) { // ha mappa, akkor jarjuk be azt is, es a kiiratashoz az utvonalat frissitsuk be
                Folder r = (Folder) resource;
                System.out.println(indent + r);
                for (Resource rs : r.getResources()) {
                    printTreeStructure(rs, directoryPath + r, "    " + indent);
                }
            } else {
                // ha fajl, akkor irassuk ki az indentalast, majd a fajlt es a teljes utvonalat.
                System.out.println(indent + resource + "\t(full path: " + directoryPath + resource + ")");
            }
        }
        
}

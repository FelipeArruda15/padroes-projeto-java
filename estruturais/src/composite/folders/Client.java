package composite.folders;

import java.nio.file.FileSystem;
import java.util.Arrays;

import composite.folders.model.File;
import composite.folders.model.FileSystemItem;
import composite.folders.model.Folder;

public class Client {

    public static void main(String[] args) {
        // Objetos LEAF -> Sem filhos
        FileSystemItem file1 = new File("Friend leters");
        FileSystemItem file2 = new File("Cristiano Ronaldo King Of Dribbling Skills HD");
        FileSystemItem file3 = new File("CR7 X Atlético de Madrid");
        FileSystemItem file4 = new File("Notes");

        // Objectos Composite -> Possui filhos
        FileSystemItem folder1 = new Folder("CR7", Arrays.asList(file1));
        FileSystemItem folder2 = new Folder("Test", Arrays.asList(file2, folder1));
        FileSystemItem folder3 = new Folder("Docs", Arrays.asList(folder2, file3, file4));

        folder3.print("");

    }

}

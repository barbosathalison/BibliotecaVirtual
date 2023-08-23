import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class AdicionarPDF {
    private static void addPDF(File arquivoSelecionado, File targetFile) throws IOException {
        PDDocument sourceDoc = PDDocument.load(arquivoSelecionado);
        PDDocument targetDoc = PDDocument.load("C:/Users/TB/Downloads/targetPDF.pdf");

        PDFMergerUtility merger = new PDFMergerUtility();
        merger.appendDocument(targetDoc, sourceDoc);

        targetDoc.save(targetFile);
        targetDoc.close();
        sourceDoc.close();
    }
    public static void main(String[] args){
        JFileChooser fileChooser = new JFileChooser();
        
        // Exibe o diálogo de seleção de arquivo
        int result = fileChooser.showOpenDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            // Obtém o arquivo selecionado
            File arquivoSelecionado = fileChooser.getSelectedFile();
            File targetPDF = new File("target.pdf");
            // Faça algo com o arquivo selecionado
            try {
                addPDF(arquivoSelecionado, targetPDF);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("Erro ao adicionar livro!");
                e.printStackTrace();
            }
            System.out.println("Livro " + arquivoSelecionado.getAbsolutePath() + " adicionado!");
        } else {
            System.out.println("Nenhum arquivo selecionado!");
        }
    }
}

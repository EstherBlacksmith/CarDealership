public class ExportReportPrinter {
    public void printReport(Exportable exportable) {
        System.out.println("Document of exportation generated:");
        System.out.println(exportable.getExportInfo());
    }
}
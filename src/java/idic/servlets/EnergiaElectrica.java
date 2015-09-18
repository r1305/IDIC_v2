package idic.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Administrador
 */
public class EnergiaElectrica extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses=request.getSession();
        String[] seleccion=request.getParameterValues("opcion");
        String[] numero=request.getParameterValues("num");
        String[] horas=request.getParameterValues("hrs");
        String[] dias=request.getParameterValues("dias");
        
        Integer[] selec=new Integer[seleccion.length];
        Integer[] num=new Integer[seleccion.length];
        Integer[] hrs=new Integer[seleccion.length];
        Integer[] dia=new Integer[seleccion.length];
        
            ses.setAttribute("artef",seleccion);
            
        
        //System.out.println(seleccion[0] +" " +numero[0] +" "+horas[0] +" "+dias[0] );
        
        float[] co2=new float[seleccion.length];
        float[] kw=new float[seleccion.length];
        String[] nombre=new String[seleccion.length];
        int[] cant=new int[seleccion.length];
        int[] h=new int[seleccion.length];
        int[] d=new int[seleccion.length];
        float[] sum=new float[seleccion.length];
        float tot=0.0f;
        
            for(int i=0;i<seleccion.length;i++){
            
               if(numero[i]!=""){
                   //System.out.println(seleccion[i]+" "+numero[i]+" "+horas[i]+" "+dias[i]+"\n");

                    hrs[i]=Integer.parseInt(horas[i]);
                    dia[i]=Integer.parseInt(dias[i]);
                    num[i]=Integer.parseInt(numero[i]);
                    

            
                switch (seleccion[i]) {
                    case "ah":
                        nombre[i]="Foco Ahorrador";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.02f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "asp":
                        nombre[i]="Aspiradora";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.6f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "br":
                        nombre[i]="Blueray";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.015f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "bp":
                        nombre[i]="Bomba de piscina";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.8f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "ce":
                        nombre[i]="Cocina Electrica";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*4.5f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "compe":
                        nombre[i]="Computador de escritorio";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.15f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "compp":
                        nombre[i]="Computador portatil";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.07f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "cong":
                        nombre[i]="Congeladora";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.35f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "console":
                        nombre[i]="Consola de Video Juegos";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.09f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "dec":
                        nombre[i]="Decodificador TV HD";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.02f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "de":
                        nombre[i]="Ducha eléctrica";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*3.5f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "eb":
                        nombre[i]="Electrobomba";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.746f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "es":
                        nombre[i]="Equipo de sonido";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.08f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "f40w":
                        nombre[i]="Fluorescente 40W";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.04f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "f100w":
                        nombre[i]="Foco 100W";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.1f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "f75w":
                        nombre[i]="Foco 75W";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.075f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "hae":
                        nombre[i]="Hervidor de Agua electrico";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*1.5f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "horno":
                        nombre[i]="Horno Microondas";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*1.1f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "lav":
                        nombre[i]="Lavadora (Hasta 10kg)";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.5f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "lic":
                        nombre[i]="Licuadora";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.3f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "oa":
                        nombre[i]="Olla arrocera";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*1f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "iron":
                        nombre[i]="Plancha";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*1f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "rgrab":
                        nombre[i]="Radiograbadora";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.03f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "refri":
                        nombre[i]="Refrigeradora";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.35f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "sr":
                        nombre[i]="Secadora de ropa";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*2.5f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break; 
                    case "sp":
                        nombre[i]="Smatphones";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.02f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "tablet":
                        nombre[i]="Tablets";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.04f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "lcd":
                        nombre[i]="Televisores LCD/Plasma (Hasta 32\")";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*0.15f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                    case "terma":
                        nombre[i]="Terma";
                        cant[i]=num[i];
                        h[i]=hrs[i];
                        d[i]=dia[i];
                        kw[i]=num[i]*hrs[i]*dia[i]*1.5f;
                        co2[i]=kw[i]*0.615f;
                        sum[i]=co2[i]*kw[i];
                        break;
                }
                    
                } 
               
               tot+=sum[i];
            }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>"+
                "<link rel='icon' type='image/png' href='img/cambioclimatico2015.jpg' /> "  +
                "<link rel='stylesheet' href='//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.css'>"+
                "<script src='//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js'></script>"+
                "<script src='//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js'></script>"+
                "<script src='//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.min.js'></script>");
            out.println("<title>Electricidad</title>");            
            out.println("</head>");
            out.println("<body style=\"background: #99ccff\">"
                    + "<div data-role=\"header\" align=\"center\" role=\"banner\" class=\"ui-header ui-bar-inherit\" >\n" +
                      "                    <p>Consumo de CO2 por Electricidad</p>\n" +
                      "                    <div data-role=\"navbar\">\n" +
                      "                        <ul>\n" +
                      "                            <li><a href=\"index.html\" data-icon=\"home\">Inicio</a></li>\n" +
                      "                            <li><a href=\"Graf.jsp\" data-icon=\"arrow-r\">Graficas</a></li>\n" +
                      "                        </ul>\n" +
                      "                    </div>\n" +
                      "</div>");
            out.println("    <div style=\"background: #99ccff\">\n" +
                        "        <table border='1'  align='center' >\n" +
                        "            <thead style='background: orange'>\n" +
                        "                <tr align='center'>\n" +
                        "                    <th width='250px'>Artefacto</th>\n" +
                        "                    <th width='150px'>kgCO2/kw</th>\n" +
                        "                </tr>\n" +
                        "                \n" +
                        "            </thead>\n" +
                        "            <tbody>\n");
                        for(int a=0;a<seleccion.length;a++){
                            if(nombre[a]!=null){
                            out.println("<tr>"
                                    +   "<td>"+nombre[a]+"</td>\n"+
                                        "<td align='right'>"+co2[a]+"</td>"
                                    +   "</tr>\n");
                            }
                        }
            out.println(" <tr><td align='center'><b>Total: </b></td><td align='center'><b>"+tot+"</b></td></tr></tbody>\n" +
                        "        </table>\n" +
                        "    </div>");
            out.println("<div id=\"co2\" style=\"background: #99ccff\"></div>\n"+
                        "    <script>\n" +
                        "    setTimeout(function(){\n" +
                        "    Morris.Donut({\n" +
                        "          element: 'co2',\n" +
                        "          data: [\n" +
                        "            {label: \"Contaminado\", value: "+ tot+"},\n" +
                        "            {label: \"No Contaminado\", value: (200000- "+tot+")}\n" +
                        "          ],\n" +
                        "          colors:[\"#FF0000\",\"#D9DAF2\"]\n" +
                        "        });\n" +
                        "        },550);\n" +
                        "    </script>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

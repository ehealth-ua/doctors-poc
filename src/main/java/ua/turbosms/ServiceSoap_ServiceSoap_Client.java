
package ua.turbosms;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-02-21T16:50:44.626+02:00
 * Generated source version: 3.1.9
 * 
 */
public final class ServiceSoap_ServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://turbosms.in.ua/api/Turbo", "Service");

    private ServiceSoap_ServiceSoap_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Service ss = new Service(wsdlURL, SERVICE_NAME);
        ServiceSoap port = ss.getServiceSoap();  
        
        {
        System.out.println("Invoking sendSMS...");
        String _sendSMS_sender = "";
        String _sendSMS_destination = "";
        String _sendSMS_text = "";
        String _sendSMS_wappush = "";
        ArrayOfString _sendSMS__return = port.sendSMS(_sendSMS_sender, _sendSMS_destination, _sendSMS_text, _sendSMS_wappush);
        System.out.println("sendSMS.result=" + _sendSMS__return);


        }
        {
        System.out.println("Invoking getCreditBalance...");
        String _getCreditBalance__return = port.getCreditBalance();
        System.out.println("getCreditBalance.result=" + _getCreditBalance__return);


        }
        {
        System.out.println("Invoking getNewMessages...");
        ArrayOfString _getNewMessages__return = port.getNewMessages();
        System.out.println("getNewMessages.result=" + _getNewMessages__return);


        }
        {
        System.out.println("Invoking auth...");
        String _auth_login = "";
        String _auth_password = "";
        String _auth__return = port.auth(_auth_login, _auth_password);
        System.out.println("auth.result=" + _auth__return);


        }
        {
        System.out.println("Invoking getMessageStatus...");
        String _getMessageStatus_messageId = "";
        String _getMessageStatus__return = port.getMessageStatus(_getMessageStatus_messageId);
        System.out.println("getMessageStatus.result=" + _getMessageStatus__return);


        }

        System.exit(0);
    }

}

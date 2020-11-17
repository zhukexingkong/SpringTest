package com.hebiao.spring;

import com.ocj.par.axis2.Order;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * @author liu fei
 *
 */
public class EInvoicePdfDownloadTest {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		try {
//			/**
//			 * http://127.0.0.1:8091/InterfaceDelivery/services/DeliveryServiceImpl?wsdl   storeDeliveryPaymentResponse  inquireDeliveryInfo
//			 *
//			 * http://127.0.0.1:8091/ws/wbScanDataRecService?wsdl
//			 */
//			//20130913021016-20130913021018-
//			JaxWsDynamicClientFactory jaxClientFactory = JaxWsDynamicClientFactory.newInstance();
//			//http://127.0.0.1:8080/interfaceService/ws/eInvoiceInService?wsdl
//			String wsdlUrl = "http://10.63.17.29:8080/InterfaceDelivery/services/DeliveryServiceImpl?wsdl";
//
//			  //String wsdlUrl = "http://127.0.0.1:8090/ws/wbScanDataRecService?wsdl";
////			wsdlUrl = "http://180.166.124.248:8080/ws/wbScanDataRecService?wsdl";
////			wsdlUrl = "http://10.22.220.67:8080/ws/wbScanDataRecService?wsdl";
////			wsdlUrl = "http://172.20.49.161/ws/wbScanDataRecService?wsdl";
//
//
////		    	  WbScanDataRecRequestDto requestDto= new WbScanDataRecRequestDto();
////		    	    requestDto.setWbNo("CJ00160125331");
////					requestDto.setDriverName("王五");
////					requestDto.setDriverPhone("18621264028");
////					requestDto.setScanTime("20141219151823");
////					requestDto.setStartTime("20141219120023");
////					requestDto.setEndTime("20141219173023");
////					requestDto.setScanType("01");
////					requestDto.setScanSite("上海一分");
//					String xmlStr = hebingetString();
//			        QName name = new QName("http://impls.webws.POS.ocj.com", "inquireDeliveryInfo");
////					xmlStr = xmlStr.replace("<","&lt;");
////					xmlStr = xmlStr.replace(">","&gt;");
//					//S
//					System.out.println(xmlStr);
//			        Client client = jaxClientFactory.createClient(wsdlUrl);
//			        //xmlStr  ="<?xml version=\"1.0\" encoding=\"UTF-8\"?><request><wbNo>3502014250</wbNo><driverName>刘某</driverName><driverPhone>18656563201</driverPhone>	<scanTime>20140528152715</scanTime>	<startTime>20140528152700</startTime><endTime>20140528152700</endTime></request>";
//                    Object[] result = client.invoke(name, xmlStr);
//                    String returnStr = (String)result[0];
//				      System.out.println(returnStr);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}


	public static void main(String[] args){
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient("http://delivery-uat.ocj.com.cn/ws/services/WebService?wsdl");
		// url为调用webService的wsdl地址
		QName name = new QName("http://axis2.par.ocj.com", "emar");
		// namespace是命名空间，methodName是方法名
		String sdate = "2020/09/01";
		String edate = "2020/09/06";
		// paramvalue为参数值
		Object[] objects;
		try {
			objects = client.invoke(name, sdate, edate);
			List<Order> orderList = (List<Order>)objects[0];
			System.out.println(orderList.get(0).getChannel_id());
			System.out.println(objects[0].toString());
			System.out.println(orderList.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public static void main(String [] args){
////		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
////		factory.setServiceClass(PosDeliveryWebService.class);
////		factory.setAddress("http://10.63.17.29:8080/InterfaceDelivery/services/DeliveryServiceImpl?wsdl");
////		// 创建接口代理对象
////		PosDeliveryWebService helloServices = (PosDeliveryWebService) factory.create();
////		String cuseCode = "1232154213";
////		DateFormat fm =new SimpleDateFormat("yyyyMMdd");
////		StringBuilder ordersb = new StringBuilder("W");
////		ordersb.append(fm.format(new Date()));
////		ordersb.append(LocalTime.now().toSecondOfDay());
////		if(cuseCode.length() > 6){
////			ordersb.append(cuseCode.substring(cuseCode.length() -6));
////		}else {
////			ordersb.append(cuseCode);
////		}
////		System.out.println(ordersb.toString());
//		double a = 78.11;
//		System.out.println((int)(a * 100));
//	}

	/**
	 * 合并查询
	 * @return
	 */
	private static String hebingetString(){
		String xml = "";
		StringBuffer sb = new StringBuffer("");
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
				.append(" <Transaction>		")
				.append(" 	<Transaction_Header>		")
				.append(" 	<transaction_id>SAD002</transaction_id>			")
				.append("	<requester>1111111111</requester>			")
				.append("	<target>301310070118940</target>			")
				.append("	<request_time>20130306132823</request_time>			")
				.append("	<terminal_eqno>00000000</terminal_eqno>			")
				.append("	<terminal_id>37677018</terminal_id>			")
				.append("	<system_serial>130306000706</system_serial>			")
				.append("	<version>V033</version>			")
				.append("	<ext_attributes><delivery_man>test</delivery_man></ext_attributes>			")
				.append("	</Transaction_Header>	")

				.append("	<Transaction_Body>			")
				.append("	<trans_type>01</trans_type>			")
				.append("	<order_count>4</order_count>			")
//		.append("	<order_set>2000999286,7718946934,7718946569,3037635694</order_set>		")
				.append("	<order_set>3037702135,3037702124</order_set>		")
//.append("	<order_set>3037699350,3037699361,3037698742</order_set>		")
				.append("	<check_value>F54031123CBE3B0D78E639BB0A96FB22</check_value>			")
				.append("	</Transaction_Body>			")
				.append("</Transaction>	");

		//System.out.println();
		xml = sb.toString();
		return xml;
//		return "asd";
	}

	/**
	 * 支付回调
	 * @return
	 */
	private static String zfgetString(){
		String xml = "";
		StringBuffer sb = new StringBuffer("");
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
				.append(" <Transaction>		")
				.append(" 	<Transaction_Header>		")
				.append(" 	<transaction_id>SAD001</transaction_id>			")
				.append("	<requester>1111111111</requester>			")
				.append("	<target>301310070118940</target>			")
				.append("	<request_time>20140520112637</request_time>			")
				.append("	<terminal_eqno>00000000</terminal_eqno>			")
				.append("	<terminal_id>11666666</terminal_id>			")
				.append("	<system_serial>2</system_serial>			")
				.append("	<version>V033</version>			")
				.append("	<ext_attributes></ext_attributes>			")
				.append("	</Transaction_Header>	")

				.append("	<Transaction_Body>			")
				.append("	<order_no>DF00147021</order_no>			")
				.append("	<pay_type>02</pay_type>			")
				.append("	<trans_type>02</trans_type>		")
				.append("	<info_type>1</info_type>			")
				.append("	<net_type>1</net_type>			")
				.append("	<mid>301310070118940</mid>			")
				.append("	<tid>37677018</tid>			")
				.append("	<cardacc_s></cardacc_s>			")
				.append("	<amount>1.00</amount>		")
				.append("	<pay_amt>1.00</pay_amt>			")
				.append("	<discount>1.00</discount>			")
				.append("	<pos_serial>500113</pos_serial>			")
				.append("	<pos_setbat>000001500113</pos_setbat>		")
				.append("	<hostserial>1.00</hostserial>			")
				.append("	<authcode>500018</authcode>			")
				.append("	<transtime>000000000001</transtime>		")
				.append("	<check_value>E22276B32C69837A4DE89FA9C3D50993</check_value>			")
				.append("	</Transaction_Body>			")
				.append("</Transaction>	");
		//System.out.println();
		xml = sb.toString();
		return xml;

	}

}

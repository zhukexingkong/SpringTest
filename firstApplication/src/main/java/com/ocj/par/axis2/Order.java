package com.ocj.par.axis2;
/**
 * <order_gb>退货</order_gb> <order_no>20101024-127016</order_no>
 * <order_seq>001</order_seq> <item_code>125483</item_code> <item_name>美的面包机
 * 惊爆促销装AHS20AB-PR(含酸奶机功能)</item_name> <order_qty>-1</order_qty>
 * <sale_price>599.0</sale_price> <order_amt>-511.97</order_amt>
 * <order_fee>-10.23</order_fee>
 * <channel_id>A100017200etam|21465444900013^20101024212359
 * -76556|00010|00|</channel_id> <link_id>LinkTech</link_id> - <order_date>
 * <yyyy>2010</yyyy> <mm>11</mm> <dd>01</dd> <hh>15</hh> <mi>56</mi>
 * </order_date> <lgroup_code>17</lgroup_code> <mgroup_code>1712</mgroup_code>
 * 
 * @author south
 * 
 */
public class Order {
    private String order_gb;
    private String order_no;
    private String order_seq;
    private String item_code;
    private String item_name;
    private String order_qty;
    private String sale_price;
    private String order_amt;

    private String order_fee;
    private String channel_id;
    private String link_id;
    private Order_date order_date;
    private String lgroup_code;
    private String mgroup_code;
    private String lgroup_name;
   
    private String ven_code;
	private String internet_yn;
    private String merge_yn;
    private String merge_type;
    private String inter_attrb_type;
    
    public String getInter_attrb_type() {
		return inter_attrb_type;
	}

	public void setInter_attrb_type(String interAttrbType) {
		inter_attrb_type = interAttrbType;
	}

	public String getVen_code() {
		return ven_code;
	}

	public void setVen_code(String venCode) {
		ven_code = venCode;
	}

	public String getInternet_yn() {
		return internet_yn;
	}

	public void setInternet_yn(String internetYn) {
		internet_yn = internetYn;
	}

	public String getMerge_yn() {
		return merge_yn;
	}

	public void setMerge_yn(String mergeYn) {
		merge_yn = mergeYn;
	}

	public String getMerge_type() {
		return merge_type;
	}

	public void setMerge_type(String mergeType) {
		merge_type = mergeType;
	} 
    
    public String getLgroup_name() {
        return lgroup_name;
    }

    public void setLgroup_name(String lgroupName) {
        lgroup_name = lgroupName;
    }

    public String getOrder_gb() {
        return order_gb;
    }

    public void setOrder_gb(String order_gb) {
        this.order_gb = order_gb;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getOrder_seq() {
        return order_seq;
    }

    public void setOrder_seq(String order_seq) {
        this.order_seq = order_seq;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getOrder_qty() {
        return order_qty;
    }

    public void setOrder_qty(String order_qty) {
        this.order_qty = order_qty;
    }

    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public String getOrder_amt() {
        return order_amt;
    }

    public void setOrder_amt(String order_amt) {
        this.order_amt = order_amt;
    }

    public String getOrder_fee() {
        return order_fee;
    }

    public void setOrder_fee(String order_fee) {
        this.order_fee = order_fee;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getLink_id() {
        return link_id;
    }

    public void setLink_id(String link_id) {
        this.link_id = link_id;
    }

    public Order_date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Order_date order_date) {
        this.order_date = order_date;
    }

    public String getLgroup_code() {
        return lgroup_code;
    }

    public void setLgroup_code(String lgroup_code) {
        this.lgroup_code = lgroup_code;
    }

    public String getMgroup_code() {
        return mgroup_code;
    }

    public void setMgroup_code(String mgroup_code) {
        this.mgroup_code = mgroup_code;
    }
}

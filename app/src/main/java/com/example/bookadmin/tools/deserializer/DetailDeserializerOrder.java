package com.example.bookadmin.tools.deserializer;

import com.example.bookadmin.bean.DetailOrderSimple;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Administrator on 2017-05-25.
 */

public class DetailDeserializerOrder implements JsonDeserializer<DetailOrderSimple> {

    @Override
    public DetailOrderSimple deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();


        String rp_id = null;
        JsonElement rp_idElement = jsonObject.get("rp_id");//订单id
        if (rp_idElement != null && !rp_idElement.isJsonNull()) {
            rp_id = rp_idElement.getAsString();
        }

        String rp_name = null;
        JsonElement rp_nameElement = jsonObject.get("rp_name");//：订单号
        if (rp_nameElement != null && !rp_nameElement.isJsonNull()) {
            rp_name = rp_nameElement.getAsString();
        }

        String rp_bcode = null;
        JsonElement rp_bcodeElement = jsonObject.get("rp_bcode");//：订单状态码
        if (rp_bcodeElement != null && !rp_bcodeElement.isJsonNull()) {
            rp_bcode = rp_bcodeElement.getAsString();
        }

        String l1_region = null;
        JsonElement l1_regionElement = jsonObject.get("l1_region");//:书库归属省
        if (l1_regionElement != null && !l1_regionElement.isJsonNull()) {
            l1_region = l1_regionElement.getAsString();
        }

        String l2_region = null;
        JsonElement l2_regionElement = jsonObject.get("l2_region");//:书库归属市
        if (l2_regionElement != null && !l2_regionElement.isJsonNull()) {
            l2_region = l2_regionElement.getAsString();
        }

        String l3_region = null;
        JsonElement l3_regionElement = jsonObject.get("l3_region");//:书库归属区
        if (l3_regionElement != null && !l3_regionElement.isJsonNull()) {
            l3_region = l3_regionElement.getAsString();
        }

        String l_address = null;
        JsonElement l_addressElement = jsonObject.get("l_address");//":书库详细地址,
        if (l_addressElement != null && !l_addressElement.isJsonNull()) {
            l_address = l_addressElement.getAsString();
        }

        String l_name = null;
        JsonElement l_nameElement = jsonObject.get("l_name");//":书库名称,
        if (l_nameElement != null && !l_nameElement.isJsonNull()) {
            l_name = l_nameElement.getAsString();
        }

        String bz_sn = null;
        JsonElement bz_snElement = jsonObject.get("bz_sn");//":采用包装sn
        if (bz_snElement != null && !bz_snElement.isJsonNull()) {
            bz_sn = bz_snElement.getAsString();
        }

        String b1_region = null;
        JsonElement b1_regionElement = jsonObject.get("b1_region");//":书箱省
        if (b1_regionElement != null && !b1_regionElement.isJsonNull()) {
            b1_region = b1_regionElement.getAsString();
        }

        String b2_region = null;
        JsonElement b2_regionElement = jsonObject.get("b2_region");//":书箱市
        if (b2_regionElement != null && !b2_regionElement.isJsonNull()) {
            b2_region = b2_regionElement.getAsString();
        }

        String b3_region = null;
        JsonElement b3_regionElement = jsonObject.get("b3_region");//":书箱区
        if (b3_regionElement != null && !b3_regionElement.isJsonNull()) {
            b3_region = b3_regionElement.getAsString();
        }

        String ad_name = null;
        JsonElement ad_nameElement = jsonObject.get("ad_name");//":书箱详细地址
        if (ad_nameElement != null && !ad_nameElement.isJsonNull()) {
            ad_name = ad_nameElement.getAsString();
        }

        String gs_name = null;
        JsonElement gs_nameElement = jsonObject.get("gs_name");//":书箱名称编号
        if (gs_nameElement != null && !gs_nameElement.isJsonNull()) {
            gs_name = gs_nameElement.getAsString();
        }

        String u_name = null;
        JsonElement u_nameElement = jsonObject.get("u_name");//":用户名称
        if (u_nameElement != null && !u_nameElement.isJsonNull()) {
            u_name = u_nameElement.getAsString();
        }

        String bc_name = null;
        JsonElement bc_nameElement = jsonObject.get("bc_name");//":状态名称
        if (bc_nameElement != null && !bc_nameElement.isJsonNull()) {
            bc_name = bc_nameElement.getAsString();
        }

        String rp_intime = null;
        JsonElement rp_intimeElement = jsonObject.get("rp_intime");//":下单时间（秒）,
        if (rp_intimeElement != null && !rp_intimeElement.isJsonNull()) {
            rp_intime = rp_intimeElement.getAsString();
        }

        String rp_uptime = null;
        JsonElement rp_uptimeElement = jsonObject.get("rp_uptime");//":修改时间
        if (rp_uptimeElement != null && !rp_uptimeElement.isJsonNull()) {
            rp_uptime = rp_uptimeElement.getAsString();
        }


        DetailOrderSimple detailOrderSimple  = new DetailOrderSimple();

        detailOrderSimple.setRp_id(rp_id);//订单id
        detailOrderSimple.setRp_name(rp_name);//：订单号
        detailOrderSimple.setRp_bcode(rp_bcode);//：订单状态码
        detailOrderSimple.setL1_region(l1_region);//:书库归属省
        detailOrderSimple.setL2_region(l2_region);//:书库归属市
        detailOrderSimple.setL3_region(l3_region);//:书库归属区
        detailOrderSimple.setL_address(l_address);//":书库详细地址,
        detailOrderSimple.setL_name(l_name);//":书库名称,
        detailOrderSimple.setBz_sn(bz_sn);//":采用包装sn
        detailOrderSimple.setB1_region(b1_region);//":书箱省
        detailOrderSimple.setB2_region(b2_region);//":书箱市
        detailOrderSimple.setB3_region(b3_region);//":书箱区
        detailOrderSimple.setAd_name(ad_name);//":书箱详细地址
        detailOrderSimple.setGs_name(gs_name);//":书箱名称编号
        detailOrderSimple.setU_name(u_name);//":用户名称
        detailOrderSimple.setBc_name(bc_name);//":状态名称
        detailOrderSimple.setRp_intime(rp_intime);//":下单时间（秒）,
        detailOrderSimple.setRp_uptime(rp_uptime);//":修改时间

        return detailOrderSimple;
    }
}

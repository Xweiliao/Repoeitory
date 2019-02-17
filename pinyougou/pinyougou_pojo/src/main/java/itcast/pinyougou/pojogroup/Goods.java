package itcast.pinyougou.pojogroup;

import itcast.pinyougou.pojo.TbGoods;
import itcast.pinyougou.pojo.TbGoodsDesc;
import itcast.pinyougou.pojo.TbItem;

import java.io.Serializable;
import java.util.List;

public class Goods implements Serializable {
    private TbGoods goods;//商品SPU
    private TbGoodsDesc goodsDesc;//商品扩展
    private List<TbItem> items;//SKU列表

    public TbGoods getGoods() {
        return goods;
    }

    public void setGoods(TbGoods goods) {
        this.goods = goods;
    }

    public TbGoodsDesc getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(TbGoodsDesc goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public List<TbItem> getItems() {
        return items;
    }

    public void setItems(List<TbItem> items) {
        this.items = items;
    }
}

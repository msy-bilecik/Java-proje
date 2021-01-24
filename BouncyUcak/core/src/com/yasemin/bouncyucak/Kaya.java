package com.yasemin.bouncyucak;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Kaya
{
    Vector2 pozisyon=new Vector2();
    TextureRegion resim;
    boolean gecildi;

    public Kaya(float x,float y, TextureRegion resim)
    {
        this.pozisyon.x=x;
        this.pozisyon.y=y;
        this.resim = resim;
    }
}

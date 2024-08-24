/*
 * @ Ho Van Thuong.java    1.0 24
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong2.bai12;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 24/08/2024
 * @version: 1.0
 */

public class CDList {
    private CD cdList[];
    private int count = 0;


    public CDList(int n) {
        this.cdList = new CD[n];
    }

    public CD[] getCDList() {
        return this.cdList;
    }

    public boolean isExits(int id)
    {
        for(int i = 0; i < this.count ; i++)
        {
            if (this.cdList[i].getMaCD() == id)
            {
                return true;
            }
        }
        return false;
    }

    public boolean addCD(CD cd)
    {
        if (cd == null)
        {
            return false;
        }
        if (this.isExits(cd.getMaCD()))
        {
            return false;
        }
        this.cdList[this.count++] = cd;
        return true;
    }

    public String toString()
    {
        String str = "";
        for (int i = 0; i < this.count; i++)
        {
            str += this.cdList[i].toString() + "\n";
        }
        return str;
    }

    public int getCount()
    {
        return this.count;
    }

    public boolean delCDByID(int id)
    {
        if (id < 0 || !(this.isExits(id)))
        {
            return false;
        }
        for (int i = 0; i < this.count; i++)
        {
            if (this.cdList[i].getMaCD() == id)
            {
                for (int j = i; j < this.count - 1; j++)
                {
                    this.cdList[j] = this.cdList[j+1];
                }
                this.count--;
                i--;
            }
        }
        return true;
    }

    public CD[] findByID(int id)
    {
        if (id < 0 || !(this.isExits(id)))
        {
            return null;
        }
        CDList temp = new CDList(this.count);
        for (int i = 0; i < this.count; i++)
        {
            if (this.cdList[i].getMaCD() == id)
            {
                temp.addCD(this.cdList[i]);
            }
        }
        return temp.getCDList();
    }

    public CD[] sortByPrice()
    {
        CD temp[]  = this.getCDList();
        for (int i = 0; i < this.count - 1; i++)
        {
            for (int j = 0; j < this.count - 1 - i; j++)
            {
                if (temp[j].getGiaThanh() < temp[j + 1].getGiaThanh())
                {
                    CD temp2 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp2;
                }
            }
        }
        return temp;
    }

    public CD[] sortByTenCD()
    {
        CD temp[] = this.getCDList();
        for (int i = 0; i < this.count - 1; i++)
            for(int j = 0; j < this.count - 1 - i; j++)
            {
                if (temp[j].getTenCD().compareTo(temp[j+1].getTenCD()) > 0)
                {
                    CD temp2 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp2;
                }
            }
        return temp;
    }

    public float tongGia()
    {
        float sum = 0.0f;
        for (int i = 0; i < this.count; i++)
        {
            sum += this.cdList[i].getGiaThanh();
        }
        return sum;
    }

    public void setCdList(CD[] cdList)
    {
        this.cdList = cdList;
    }
}

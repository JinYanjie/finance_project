package com.kangce.mybatis.model;

import java.io.Serializable;

public class Utbasebalancesheet implements Serializable {
    private Integer id;

    private String name;

    private Integer hierarchy;

    private Integer rownum;

    private String rowstring;

    private String formula;

    private Integer type;

    private Integer priority;

    private Integer edition;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(Integer hierarchy) {
        this.hierarchy = hierarchy;
    }

    public Integer getRownum() {
        return rownum;
    }

    public void setRownum(Integer rownum) {
        this.rownum = rownum;
    }

    public String getRowstring() {
        return rowstring;
    }

    public void setRowstring(String rowstring) {
        this.rowstring = rowstring;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", hierarchy=").append(hierarchy);
        sb.append(", rownum=").append(rownum);
        sb.append(", rowstring=").append(rowstring);
        sb.append(", formula=").append(formula);
        sb.append(", type=").append(type);
        sb.append(", priority=").append(priority);
        sb.append(", edition=").append(edition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
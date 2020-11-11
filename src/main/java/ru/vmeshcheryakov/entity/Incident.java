package ru.vmeshcheryakov.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Incident")
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    String name;

    //тут должен быть атрибут хранящий или картинку или ссылку на картинку

    @Column(name = "description")
    String description;

    @Column(name = "createIncident")
    Date createIncident;

    @Column(name = "close_incident")
    Date closeIncident;

    @OneToOne(cascade = CascadeType.ALL)
    IncidentAssignmentService incidentAssignmentService;

    @Column(name = "user_full_name")
    String userFullName;

    @Column(name = "login_user")
    String loginUser;

    @Column(name = "user_phone_uumber")
    String userPhoneNumber;

    @Column(name = "user_work_place")
    String userWorkPlace;

    @Column(name = "user_mail")
    String userMail;

    @OneToOne(cascade = CascadeType.ALL)
    Status status;

    @Column(name = "analyst")
    String analyst;

    @OneToOne(cascade = CascadeType.ALL)
    PriorityOfIncident priorityOfIncident;

    @OneToOne(cascade = CascadeType.ALL)
    Category category;

    public Incident() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateIncident() {
        return createIncident;
    }

    public void setCreateIncident(Date createIncident) {
        this.createIncident = createIncident;
    }

    public Date getCloseIncident() {
        return closeIncident;
    }

    public void setCloseIncident(Date closeIncident) {
        this.closeIncident = closeIncident;
    }

    public IncidentAssignmentService getIncidentAssignmentService() {
        return incidentAssignmentService;
    }

    public void setIncidentAssignmentService(IncidentAssignmentService incidentAssignmentService) {
        this.incidentAssignmentService = incidentAssignmentService;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserWorkPlace() {
        return userWorkPlace;
    }

    public void setUserWorkPlace(String userWorkPlace) {
        this.userWorkPlace = userWorkPlace;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAnalyst() {
        return analyst;
    }

    public void setAnalyst(String analyst) {
        this.analyst = analyst;
    }

    public PriorityOfIncident getPriorityOfIncident() {
        return priorityOfIncident;
    }

    public void setPriorityOfIncident(PriorityOfIncident priorityOfIncident) {
        this.priorityOfIncident = priorityOfIncident;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createIncident=" + createIncident +
                ", closeIncident=" + closeIncident +
                ", incidentAssignmentService=" + incidentAssignmentService +
                ", userFullName='" + userFullName + '\'' +
                ", loginUser='" + loginUser + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userWorkPlace='" + userWorkPlace + '\'' +
                ", userMail='" + userMail + '\'' +
                ", status=" + status +
                ", analyst='" + analyst + '\'' +
                ", priorityOfIncident=" + priorityOfIncident +
                ", category=" + category +
                '}';
    }
}

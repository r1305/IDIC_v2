<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


        <nav class="navbar ">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="index.jsp">IDIC</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Generales<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li ><a href="mapas.jsp">Mapa</a></li>
                                <li><a href="Generales.jsp">Detalles</a></li>

                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Sector Electricidad<span class="caret"></span></a>
                            <ul class="dropdown-menu">

                                <li><a href="filtroDistritos.jsp">Distritos</a></li>

                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Sector Transporte<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"># Viajes</a></li>
                                <li><a href="#"># Tiempo</a></li>
                                <li><a href="#">Por Combustible</a></li>

                            </ul>
                        </li>
                        <li class="nav nav-tabs">
                            <a href="Residuos.jsp">Sector Residuos</a>

                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="Logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
                    </ul>
                </div>
            </div>
        </nav>
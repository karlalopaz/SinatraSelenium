package com.sinatra;

import org.junit.Test;

public class LoginSongsBySinatra  extends SongsBySinatraParent
{
    @Test
    public void LoginSongs ()
    {
        navegarSitio("http://evening-bastion-49392.herokuapp.com/");
        validarHomePage("Welcome to to this website all about the songs of the great Frank Sinatra");
        hacerLogin("frank", "sinatra");
        validarMensajeLogin("You are now logged in as frank");
        validarSongsPage ();
        cerrarBrowser();
    }

    @Test
    public void LikeSong ()
    {
        navegarSitio("http://evening-bastion-49392.herokuapp.com/");
        validarHomePage("Welcome to to this website all about the songs of the great Frank Sinatra");
        hacerLogin("frank", "sinatra");
        validarMensajeLogin("You are now logged in as frank");
        validarSongsPage ();
        seleccionarCancion(2);
        darLike();
        logOut();
        validarLogout("You have now logged out");
        cerrarBrowser();
    }
}

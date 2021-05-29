create database registro_aluno_trabalho_pratico;

use registro_aluno_trabalho_pratico;

create table cursos(
	id_curso int not null auto_increment,
    nome varchar(100),
    professor varchar(100),
    foto_professor varchar(100),
    PRIMARY KEY (id_curso)
);

create table alunos(
    id_aluno int not null auto_increment,
    nome varchar(100),
    sexo varchar(1),
    data_nacimento date,
    curso int not null,
    email varchar(100),
    aceita_msg boolean,
    obs text,
    foto varchar(100),
    primary key (id_aluno),
    FOREIGN KEY (curso) REFERENCES cursos(id_curso)
);

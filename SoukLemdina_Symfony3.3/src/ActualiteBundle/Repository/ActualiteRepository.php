<?php

namespace ActualiteBundle\Repository;

/**
 * ActualiteRepository
 *
 * This class was generated by the Doctrine ORM. Add your own custom
 * repository methods below.
 */
class ActualiteRepository extends \Doctrine\ORM\EntityRepository
{
    public function findActualite($search)
    {
        return $this->createQueryBuilder('e')
            ->where('UPPER(e.titre) LIKE UPPER(:search)')
            ->orWhere('UPPER(e.contenu) Like UPPER(:search)')
            ->setParameter('search', '%'.$search.'%')
            ->orderBy('e.date', 'DESC')
            ->getQuery()
            ->getResult();

    }
}